package shuaicj.example.di.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

@SuppressWarnings("unused")
class Example5 {

    static class Mod1 extends AbstractModule {
        @Override protected void configure() {
            bind(I.class).to(A.class);
        }
    }

    static class Mod2 extends AbstractModule {

        @Override protected void configure() {}

        @Provides I i() { return new A(); }
    }

    interface I {
        void nothing();
    }

    static class A implements I {
        @Override public void nothing() {}
    }
}
