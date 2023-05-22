package ua.goit.vic.planets;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "planet")
public class Planet {
    @Id
    private String id;

    @Column(name = "planet_name", length = 500, nullable = false)
    private String name;
}
