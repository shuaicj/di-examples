package shuaicj.example.di.feather;

import javax.inject.Inject;

@SuppressWarnings("unused")
class Example3 {

    static class A {

        final B b;

        @Inject A(B b) { this.b = b; }
    }

    static class B {}
}
