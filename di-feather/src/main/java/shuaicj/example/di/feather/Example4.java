package shuaicj.example.di.feather;

import org.codejargon.feather.Provides;

@SuppressWarnings("unused")
class Example4 {

    static class Conf {
        @Provides I i() { return new A(); }
    }

    interface I {
        void nothing();
    }

    static class A implements I {
        @Override public void nothing() {}
    }
}
