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
 * struct PROJ_FILE_API {
 *     int version;
 *     PROJ_FILE_HANDLE *(*open_cbk)(PJ_CONTEXT *, const char *, PROJ_OPEN_ACCESS, void *);
 *     size_t (*read_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *, size_t, void *);
 *     size_t (*write_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, const void *, size_t, void *);
 *     int (*seek_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, long long, int, void *);
 *     unsigned long long (*tell_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *);
 *     void (*close_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *);
 *     int (*exists_cbk)(PJ_CONTEXT *, const char *, void *);
 *     int (*mkdir_cbk)(PJ_CONTEXT *, const char *, void *);
 *     int (*unlink_cbk)(PJ_CONTEXT *, const char *, void *);
 *     int (*rename_cbk)(PJ_CONTEXT *, const char *, const char *, void *);
 * }
 * }
 */
public class PROJ_FILE_API {

    PROJ_FILE_API() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        proj_h.C_INT.withName("version"),
        MemoryLayout.paddingLayout(4),
        proj_h.C_POINTER.withName("open_cbk"),
        proj_h.C_POINTER.withName("read_cbk"),
        proj_h.C_POINTER.withName("write_cbk"),
        proj_h.C_POINTER.withName("seek_cbk"),
        proj_h.C_POINTER.withName("tell_cbk"),
        proj_h.C_POINTER.withName("close_cbk"),
        proj_h.C_POINTER.withName("exists_cbk"),
        proj_h.C_POINTER.withName("mkdir_cbk"),
        proj_h.C_POINTER.withName("unlink_cbk"),
        proj_h.C_POINTER.withName("rename_cbk")
    ).withName("PROJ_FILE_API");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int version
     * }
     */
    public static final OfInt version$layout() {
        return version$LAYOUT;
    }

    private static final long version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int version
     * }
     */
    public static final long version$offset() {
        return version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int version
     * }
     */
    public static int version(MemorySegment struct) {
        return struct.get(version$LAYOUT, version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int version
     * }
     */
    public static void version(MemorySegment struct, int fieldValue) {
        struct.set(version$LAYOUT, version$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * PROJ_FILE_HANDLE *(*open_cbk)(PJ_CONTEXT *, const char *, PROJ_OPEN_ACCESS, void *)
     * }
     */
    public static class open_cbk {

        open_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_INT,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(open_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(open_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout open_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("open_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PROJ_FILE_HANDLE *(*open_cbk)(PJ_CONTEXT *, const char *, PROJ_OPEN_ACCESS, void *)
     * }
     */
    public static final AddressLayout open_cbk$layout() {
        return open_cbk$LAYOUT;
    }

    private static final long open_cbk$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PROJ_FILE_HANDLE *(*open_cbk)(PJ_CONTEXT *, const char *, PROJ_OPEN_ACCESS, void *)
     * }
     */
    public static final long open_cbk$offset() {
        return open_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PROJ_FILE_HANDLE *(*open_cbk)(PJ_CONTEXT *, const char *, PROJ_OPEN_ACCESS, void *)
     * }
     */
    public static MemorySegment open_cbk(MemorySegment struct) {
        return struct.get(open_cbk$LAYOUT, open_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PROJ_FILE_HANDLE *(*open_cbk)(PJ_CONTEXT *, const char *, PROJ_OPEN_ACCESS, void *)
     * }
     */
    public static void open_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(open_cbk$LAYOUT, open_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * size_t (*read_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *, size_t, void *)
     * }
     */
    public static class read_cbk {

        read_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_LONG,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_LONG,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(read_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(read_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3, MemorySegment _x4) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout read_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("read_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t (*read_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *, size_t, void *)
     * }
     */
    public static final AddressLayout read_cbk$layout() {
        return read_cbk$LAYOUT;
    }

    private static final long read_cbk$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t (*read_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *, size_t, void *)
     * }
     */
    public static final long read_cbk$offset() {
        return read_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t (*read_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *, size_t, void *)
     * }
     */
    public static MemorySegment read_cbk(MemorySegment struct) {
        return struct.get(read_cbk$LAYOUT, read_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t (*read_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *, size_t, void *)
     * }
     */
    public static void read_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(read_cbk$LAYOUT, read_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * size_t (*write_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, const void *, size_t, void *)
     * }
     */
    public static class write_cbk {

        write_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_LONG,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_LONG,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(write_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(write_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, long _x3, MemorySegment _x4) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout write_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("write_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t (*write_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, const void *, size_t, void *)
     * }
     */
    public static final AddressLayout write_cbk$layout() {
        return write_cbk$LAYOUT;
    }

    private static final long write_cbk$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t (*write_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, const void *, size_t, void *)
     * }
     */
    public static final long write_cbk$offset() {
        return write_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t (*write_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, const void *, size_t, void *)
     * }
     */
    public static MemorySegment write_cbk(MemorySegment struct) {
        return struct.get(write_cbk$LAYOUT, write_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t (*write_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, const void *, size_t, void *)
     * }
     */
    public static void write_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(write_cbk$LAYOUT, write_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*seek_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, long long, int, void *)
     * }
     */
    public static class seek_cbk {

        seek_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, long _x2, int _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_INT,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_LONG_LONG,
            proj_h.C_INT,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(seek_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(seek_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, long _x2, int _x3, MemorySegment _x4) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout seek_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("seek_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*seek_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, long long, int, void *)
     * }
     */
    public static final AddressLayout seek_cbk$layout() {
        return seek_cbk$LAYOUT;
    }

    private static final long seek_cbk$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*seek_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, long long, int, void *)
     * }
     */
    public static final long seek_cbk$offset() {
        return seek_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*seek_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, long long, int, void *)
     * }
     */
    public static MemorySegment seek_cbk(MemorySegment struct) {
        return struct.get(seek_cbk$LAYOUT, seek_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*seek_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, long long, int, void *)
     * }
     */
    public static void seek_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(seek_cbk$LAYOUT, seek_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * unsigned long long (*tell_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static class tell_cbk {

        tell_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            long apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_LONG_LONG,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(tell_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(tell_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout tell_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("tell_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long long (*tell_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static final AddressLayout tell_cbk$layout() {
        return tell_cbk$LAYOUT;
    }

    private static final long tell_cbk$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long long (*tell_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static final long tell_cbk$offset() {
        return tell_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long long (*tell_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static MemorySegment tell_cbk(MemorySegment struct) {
        return struct.get(tell_cbk$LAYOUT, tell_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long long (*tell_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static void tell_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(tell_cbk$LAYOUT, tell_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*close_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static class close_cbk {

        close_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(close_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(close_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout close_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("close_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*close_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static final AddressLayout close_cbk$layout() {
        return close_cbk$LAYOUT;
    }

    private static final long close_cbk$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*close_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static final long close_cbk$offset() {
        return close_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*close_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static MemorySegment close_cbk(MemorySegment struct) {
        return struct.get(close_cbk$LAYOUT, close_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*close_cbk)(PJ_CONTEXT *, PROJ_FILE_HANDLE *, void *)
     * }
     */
    public static void close_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(close_cbk$LAYOUT, close_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*exists_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static class exists_cbk {

        exists_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_INT,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(exists_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(exists_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout exists_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("exists_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*exists_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static final AddressLayout exists_cbk$layout() {
        return exists_cbk$LAYOUT;
    }

    private static final long exists_cbk$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*exists_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static final long exists_cbk$offset() {
        return exists_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*exists_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static MemorySegment exists_cbk(MemorySegment struct) {
        return struct.get(exists_cbk$LAYOUT, exists_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*exists_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static void exists_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(exists_cbk$LAYOUT, exists_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*mkdir_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static class mkdir_cbk {

        mkdir_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_INT,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(mkdir_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(mkdir_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout mkdir_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mkdir_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*mkdir_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static final AddressLayout mkdir_cbk$layout() {
        return mkdir_cbk$LAYOUT;
    }

    private static final long mkdir_cbk$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*mkdir_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static final long mkdir_cbk$offset() {
        return mkdir_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*mkdir_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static MemorySegment mkdir_cbk(MemorySegment struct) {
        return struct.get(mkdir_cbk$LAYOUT, mkdir_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*mkdir_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static void mkdir_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mkdir_cbk$LAYOUT, mkdir_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*unlink_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static class unlink_cbk {

        unlink_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_INT,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(unlink_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(unlink_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout unlink_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("unlink_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*unlink_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static final AddressLayout unlink_cbk$layout() {
        return unlink_cbk$LAYOUT;
    }

    private static final long unlink_cbk$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*unlink_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static final long unlink_cbk$offset() {
        return unlink_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*unlink_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static MemorySegment unlink_cbk(MemorySegment struct) {
        return struct.get(unlink_cbk$LAYOUT, unlink_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*unlink_cbk)(PJ_CONTEXT *, const char *, void *)
     * }
     */
    public static void unlink_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(unlink_cbk$LAYOUT, unlink_cbk$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*rename_cbk)(PJ_CONTEXT *, const char *, const char *, void *)
     * }
     */
    public static class rename_cbk {

        rename_cbk() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            proj_h.C_INT,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER,
            proj_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = proj_h.upcallHandle(rename_cbk.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(rename_cbk.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout rename_cbk$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rename_cbk"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*rename_cbk)(PJ_CONTEXT *, const char *, const char *, void *)
     * }
     */
    public static final AddressLayout rename_cbk$layout() {
        return rename_cbk$LAYOUT;
    }

    private static final long rename_cbk$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*rename_cbk)(PJ_CONTEXT *, const char *, const char *, void *)
     * }
     */
    public static final long rename_cbk$offset() {
        return rename_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*rename_cbk)(PJ_CONTEXT *, const char *, const char *, void *)
     * }
     */
    public static MemorySegment rename_cbk(MemorySegment struct) {
        return struct.get(rename_cbk$LAYOUT, rename_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*rename_cbk)(PJ_CONTEXT *, const char *, const char *, void *)
     * }
     */
    public static void rename_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rename_cbk$LAYOUT, rename_cbk$OFFSET, fieldValue);
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

