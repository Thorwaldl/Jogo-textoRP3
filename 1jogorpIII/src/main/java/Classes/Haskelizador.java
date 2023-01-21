package Classes;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import jdk.internal.loader.Loader;

@Platform(include={"<HsFFI.h>","Safe_stub.h"})
public class Safe {
    static { Loader.load(); }
    public static native void hs_init(int[] argc, @Cast("char***") @ByPtrPtr PointerPointer argv);
    public static native int fibonacci_hs(int i);
    public static void main(String[] args) {
        hs_init(null, null);
        int i = fibonacci_hs(42);
        System.out.println("Fibonacci: " + i);
    }
}