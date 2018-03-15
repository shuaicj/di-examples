package shuaicj.example.di.dagger;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DaggerTest {

    @Test
    public void example1() {
        Example1.Comp comp = DaggerExample1_Comp.create();
        Example1.A a1 = comp.a();
        Example1.A a2 = comp.a();
        assertThat(a1).isNotNull();
        assertThat(a2).isNotNull();
        assertThat(a1).isNotEqualTo(a2);
    }

    @Test
    public void example2() {
        Example2.Comp comp = DaggerExample2_Comp.create();
        Example2.A a1 = comp.a();
        Example2.A a2 = comp.a();
        assertThat(a1).isNotNull();
        assertThat(a2).isNotNull();
        assertThat(a1).isEqualTo(a2);
    }

    @Test
    public void example3() {
        Example3.A a = DaggerExample3_Comp.create().a();
        assertThat(a).isNotNull();
        assertThat(a.b).isNotNull();
    }

    @Test
    public void example4() {
        Example4.A a = DaggerExample4_Comp.create().a();
        assertThat(a).isNotNull();
        assertThat(a.b).isNotNull();
    }

    @Test
    public void example5() {
        Example5.I i = DaggerExample5_Comp.create().i();
        assertThat(i).isNotNull();
    }

    @Test
    public void example6() {
        Example6.A a = DaggerExample6_Comp.create().a();
        assertThat(a.b.name).isEqualTo("b2");
    }
}
