package shuaicj.example.di.feather;

import static org.assertj.core.api.Assertions.assertThat;

import org.codejargon.feather.Feather;
import org.junit.Test;

public class FeatherTest {

    @Test
    public void example1() {
        Feather feather = Feather.with();
        Example1.A a1 = feather.instance(Example1.A.class);
        Example1.A a2 = feather.instance(Example1.A.class);
        assertThat(a1).isNotNull();
        assertThat(a2).isNotNull();
        assertThat(a1).isNotEqualTo(a2);
    }

    @Test
    public void example2() {
        Feather feather = Feather.with();
        Example2.A a1 = feather.instance(Example2.A.class);
        Example2.A a2 = feather.instance(Example2.A.class);
        assertThat(a1).isNotNull();
        assertThat(a2).isNotNull();
        assertThat(a1).isEqualTo(a2);
    }

    @Test
    public void example3() {
        Feather feather = Feather.with();
        Example3.A a = feather.instance(Example3.A.class);
        assertThat(a).isNotNull();
        assertThat(a.b).isNotNull();
    }

    @Test
    public void example4() {
        Feather feather = Feather.with();
        Example4.A a = new Example4.A();
        feather.injectFields(a);
        assertThat(a.b).isNotNull();
    }

    @Test
    public void example5() {
        Feather feather = Feather.with(new Example5.Conf());
        Example5.I i = feather.instance(Example5.I.class);
        assertThat(i).isNotNull();
    }

    @Test
    public void example6() {
        Feather feather = Feather.with(new Example6.Conf());
        Example6.A a = feather.instance(Example6.A.class);
        assertThat(a.b.name).isEqualTo("b2");
    }
}
