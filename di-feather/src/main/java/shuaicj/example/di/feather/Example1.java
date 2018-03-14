package shuaicj.example.di.feather;

import javax.inject.Inject;

@SuppressWarnings("unused")
class Example1 {

    static class A {
        @Inject A(B b) {}
    }

    static class B {}
}
