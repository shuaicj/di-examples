package shuaicj.example.di.guice;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

public class GuiceTest {

    @Test
    public void example1() {
        Injector injector = Guice.createInjector();
        Example1.A a1 = injector.getInstance(Example1.A.class);
        Example1.A a2 = injector.getInstance(Example1.A.class);
        assertThat(a1).isNotNull();
        assertThat(a2).isNotNull();
        assertThat(a1).isNotEqualTo(a2);
    }

    @Test
    public void example2() {
        Injector injector = Guice.createInjector();
        Example2.A a1 = injector.getInstance(Example2.A.class);
        Example2.A a2 = injector.getInstance(Example2.A.class);
        assertThat(a1).isNotNull();
        assertThat(a2).isNotNull();
        assertThat(a1).isEqualTo(a2);
    }

    @Test
    public void example3() {
        Injector injector = Guice.createInjector();
        Example3.A a = injector.getInstance(Example3.A.class);
        assertThat(a).isNotNull();
        assertThat(a.b).isNotNull();
    }

    @Test
    public void example4() {
        Injector injector = Guice.createInjector();
        Example4.A a = injector.getInstance(Example4.A.class);
        assertThat(a.b).isNotNull();
    }

    @Test
    public void example5() {
        Injector injector1 = Guice.createInjector(new Example5.Mod1());
        Example5.I i1 = injector1.getInstance(Example5.I.class);
        assertThat(i1).isNotNull();
        Injector injector2 = Guice.createInjector(new Example5.Mod2());
        Example5.I i2 = injector2.getInstance(Example5.I.class);
        assertThat(i2).isNotNull();
    }

    @Test
    public void example6() {
        Injector injector1 = Guice.createInjector(new Example6.Mod1());
        Example6.A a1 = injector1.getInstance(Example6.A.class);
        assertThat(a1.b.name).isEqualTo("b2");
        Injector injector2 = Guice.createInjector(new Example6.Mod2());
        Example6.A a2 = injector2.getInstance(Example6.A.class);
        assertThat(a2.b.name).isEqualTo("b2");
    }
}
