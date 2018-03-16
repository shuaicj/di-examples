package shuaicj.example.di.dagger;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@SuppressWarnings("unused")
class Example6 {

    @Component(modules = Example6.Mod.class)
    interface Comp {
        A a();
    }

    @Module
    static class Mod {

        @Provides @Named("b1") B b1() { return new B("b1"); }

        @Provides @Named("b2") B b2() { return new B("b2"); }
    }

    static class A {

        final B b;

        @Inject A(@Named("b2") B b) { this.b = b; }
    }

    static class B {

        final String name;

        B(String name) { this.name = name; }
    }
}
