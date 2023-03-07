public class Link {

  public String name;
  public double avg;
  public Link next;

  public Link(String name, double avg) {

    this.name = name;
    this.avg = avg;
    this.next = null;

  }

  public void displayLink() {

    System.out.println("Name: \t" + name + " || Average: \t" + avg);

  }

}
