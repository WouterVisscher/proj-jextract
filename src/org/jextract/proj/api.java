package org.jextract.proj;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.charset.StandardCharsets;

public class api {

    public static void main(String[] args) throws Throwable {

        try (Arena arena = Arena.ofConfined()) {
            MemorySegment proj_info = proj_h.proj_info(arena);
            MemorySegment version = PJ_INFO.version(proj_info);

            version = version.reinterpret(PJ_INFO.version$layout().byteSize());
            String s = StandardCharsets.UTF_8.decode(version.asByteBuffer()).toString();

            System.out.println(s);

            MemorySegment coord = proj_h.proj_coord(arena, 155000, 463000, 0, 0);
            MemorySegment context = proj_h.proj_context_create();

            final var sourceCrs = arena.allocateFrom("EPSG:28992");
            final var targetCrs = arena.allocateFrom("EPSG:9067");
            final var NULL = MemorySegment.NULL;

            MemorySegment pj = proj_h.proj_create_crs_to_crs(context, sourceCrs, targetCrs, NULL);
            MemorySegment proj_trans = proj_h.proj_trans(arena, pj, 1, coord);

            MemorySegment new_coord = PJ_COORD.xy(proj_trans);
            new_coord = new_coord.reinterpret(PJ_COORD.xy$layout().byteSize());

            System.out.println(PJ_XY.x(new_coord));
            System.out.println(PJ_XY.y(new_coord));

        }

    }
}
