package shuaicj.example.di.dagger;

import javax.inject.Inject;

import dagger.Component;

@SuppressWarnings("unused")
class Example4 {

    @Component
    interface Comp {
        A a();
    }

    static class A {

        @Inject B b;

        @Inject A() {}
    }

    static class B {
        @Inject B() {}
    }
}
