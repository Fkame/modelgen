package example;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "javax_table", schema = "db")
public class TestEntityJavax {

    @Id
    private long id;

    @Column
    private String strCol;

    @Column
    private LocalDate local_Date_Column;

    @Column(name = "alias_column")
    private String renamedColumn;
}
