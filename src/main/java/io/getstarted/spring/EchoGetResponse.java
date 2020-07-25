package io.getstarted.spring;

public class EchoGetResponse {

  private Args args;

  public Args getArgs() {
    return args;
  }

  public void setArgs(Args args) {
    this.args = args;
  }

  public static class Args {

    private String foo;

    private String bar;

    public String getFoo() {
      return foo;
    }

    public void setFoo(String foo) {
      this.foo = foo;
    }

    public String getBar() {
      return bar;
    }

    public void setBar(String bar) {
      this.bar = bar;
    }
  }
}
