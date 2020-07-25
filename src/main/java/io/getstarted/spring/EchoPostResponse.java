package io.getstarted.spring;

public class EchoPostResponse {

  private Args args;

  private Data data;

  public Args getArgs() {
    return args;
  }

  public void setArgs(Args args) {
    this.args = args;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
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

  public static class Data {

    private String message;

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }
}
