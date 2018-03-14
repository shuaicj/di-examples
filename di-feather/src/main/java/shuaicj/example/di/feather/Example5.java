package shuaicj.example.di.feather;

import javax.inject.Inject;
import javax.inject.Named;

import org.codejargon.feather.Provides;

@SuppressWarnings("unused")
class Example5 {

    static class Conf {

        @Provides @Named("b1") B b1() { return new B("b1"); }

        @Provides @Named("b2") B b2() { return new B("b2"); }
    }

    static class A {

        final B b;

        @Inject public A(@Named("b2") B b) { this.b = b; }
    }

    static class B {

        final String name;

        B(String name) { this.name = name; }
    }
}
