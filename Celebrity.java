public class Celebrity {
  private final String name;
  private final String clue;
  private final String type;

  public Celebrity(String name, String clue, String type) {
    this.name = name;
    this.clue = clue;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public String getClue() {
    return clue;
  }

  public String getType() {
    return type;
  }
}