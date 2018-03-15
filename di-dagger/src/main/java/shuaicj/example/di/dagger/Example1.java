package shuaicj.example.di.dagger;

import javax.inject.Inject;

import dagger.Component;

@SuppressWarnings("unused")
class Example1 {

    @Component
    interface Comp {
        A a();
    }

    static class A {
        @Inject A() {}
    }
}
