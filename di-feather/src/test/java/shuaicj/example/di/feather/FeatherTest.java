package shuaicj.example.di.feather;

import static org.assertj.core.api.Assertions.assertThat;

import org.codejargon.feather.Feather;
import org.junit.Test;

public class FeatherTest {

    @Test
    public void example1() {
        Feather feather = Feather.with();
        Example1.A a = feather.instance(Example1.A.class);
        assertThat(a).isNotNull();
    }

    @Test
    public void example2() {
        Feather feather = Feather.with();
        Example2.A a = new Example2.A();
        feather.injectFields(a);
        assertThat(a.b).isNotNull();
    }

    @Test
    public void example3() {
        Feather feather = Feather.with();
        Example3.A a1 = feather.instance(Example3.A.class);
        Example3.A a2 = feather.instance(Example3.A.class);
        assertThat(a1).isEqualTo(a2);
    }

    @Test
    public void example4() {
        Feather feather = Feather.with(new Example4.Conf());
        Example4.I i = feather.instance(Example4.I.class);
        assertThat(i).isNotNull();
    }

    @Test
    public void example5() {
        Feather feather = Feather.with(new Example5.Conf());
        Example5.A a = feather.instance(Example5.A.class);
        assertThat(a.b.name).isEqualTo("b2");
    }
}
