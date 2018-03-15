package shuaicj.example.di.feather;

import javax.inject.Inject;

@SuppressWarnings("unused")
class Example4 {

    static class A {
        @Inject B b;
    }

    static class B {}
}
