package shuaicj.example.di.dagger;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@SuppressWarnings("unused")
class Example2 {

    @Component
    @Singleton
    interface Comp {
        A a();
    }

    @Singleton
    static class A {
        @Inject A() {}
    }
}
