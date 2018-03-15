package shuaicj.example.di.dagger;

import javax.inject.Inject;

import dagger.Component;

@SuppressWarnings("unused")
class Example3 {

    @Component
    interface Comp {
        A a();
    }

    static class A {

        final B b;

        @Inject A(B b) { this.b = b; }
    }

    static class B {
        @Inject B() {}
    }
}
