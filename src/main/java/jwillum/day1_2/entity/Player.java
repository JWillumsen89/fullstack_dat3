package jwillum.day1_2.entity;

import jakarta.persistence.*;

@Entity(name = "spiller")
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "spiller_navn", nullable = false)
  private String name;

  public Player() {
  }

  public Player(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
