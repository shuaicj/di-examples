package shuaicj.example.di.dagger;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@SuppressWarnings("unused")
class Example5 {

    @Component(modules = Example5.Mod.class)
    interface Comp {
        I i();
    }

    @Module
    static class Mod {
        @Provides I i() { return new A(); }
    }

    interface I {
        void nothing();
    }

    static class A implements I {
        @Override public void nothing() {}
    }
}
