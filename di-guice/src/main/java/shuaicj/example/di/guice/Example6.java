package shuaicj.example.di.guice;

import javax.inject.Inject;
import javax.inject.Named;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

@SuppressWarnings("unused")
class Example6 {

    static class Mod1 extends AbstractModule {
        @Override protected void configure() {
            bind(B.class).annotatedWith(Names.named("b1")).toInstance(new B("b1"));
            bind(B.class).annotatedWith(Names.named("b2")).toInstance(new B("b2"));
        }
    }

    static class Mod2 extends AbstractModule {

        @Override protected void configure() {}

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
