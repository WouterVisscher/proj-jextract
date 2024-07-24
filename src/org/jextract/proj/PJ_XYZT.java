// Generated by jextract

package org.jextract.proj;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     double x;
 *     double y;
 *     double z;
 *     double t;
 * }
 * }
 */
public class PJ_XYZT {

    PJ_XYZT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        proj_h.C_DOUBLE.withName("x"),
        proj_h.C_DOUBLE.withName("y"),
        proj_h.C_DOUBLE.withName("z"),
        proj_h.C_DOUBLE.withName("t")
    ).withName("$anon$269:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfDouble x$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double x
     * }
     */
    public static final OfDouble x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double x
     * }
     */
    public static double x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double x
     * }
     */
    public static void x(MemorySegment struct, double fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfDouble y$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double y
     * }
     */
    public static final OfDouble y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double y
     * }
     */
    public static double y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double y
     * }
     */
    public static void y(MemorySegment struct, double fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfDouble z$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("z"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double z
     * }
     */
    public static final OfDouble z$layout() {
        return z$LAYOUT;
    }

    private static final long z$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double z
     * }
     */
    public static final long z$offset() {
        return z$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double z
     * }
     */
    public static double z(MemorySegment struct) {
        return struct.get(z$LAYOUT, z$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double z
     * }
     */
    public static void z(MemorySegment struct, double fieldValue) {
        struct.set(z$LAYOUT, z$OFFSET, fieldValue);
    }

    private static final OfDouble t$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("t"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double t
     * }
     */
    public static final OfDouble t$layout() {
        return t$LAYOUT;
    }

    private static final long t$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double t
     * }
     */
    public static final long t$offset() {
        return t$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double t
     * }
     */
    public static double t(MemorySegment struct) {
        return struct.get(t$LAYOUT, t$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double t
     * }
     */
    public static void t(MemorySegment struct, double fieldValue) {
        struct.set(t$LAYOUT, t$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

