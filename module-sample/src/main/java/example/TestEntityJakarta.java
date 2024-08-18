package example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "jakarta_entity", schema = "db")
public class TestEntityJakarta {

    @Id
    private long id;

    @Column
    private String strCol;

    @Column
    private LocalDate local_Date_Column;

    @Column(name = "alias_column")
    private String renamedColumn;
}
