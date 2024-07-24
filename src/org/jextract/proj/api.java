package org.jextract.proj;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.VarHandle;
import java.nio.charset.StandardCharsets;

public class api {

    public static void main(String[] args) throws Throwable {

        try (Arena arena = Arena.ofConfined()) {
            // MemorySegment Pj_info = PJ_INFO.allocate(arena);
        
            MemorySegment proj_info = proj_h.proj_info(arena);
            // proj_info = proj_info.reinterpret(PJ_INFO.layout().byteSize());

            int major = PJ_INFO.major(proj_info);
            System.out.println(major);
            int minor = PJ_INFO.minor(proj_info);
            System.out.println(minor);
            int patch = PJ_INFO.patch(proj_info);
            System.out.println(patch);
            MemorySegment version = PJ_INFO.version(proj_info);

            version = version.reinterpret(PJ_INFO.version$layout().byteSize());
            String s = StandardCharsets.UTF_8.decode(version.asByteBuffer()).toString();

            System.out.println(s);
            


        }

    }
}
