package Task08_06;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Shop {
    @Id

    private Integer id;
    @Column
    private String address;
    @Column
    private Double common;
    @Column
    private String createDate;
    @Column
    private String name;
    @OneToMany(mappedBy = "shop",cascade = CascadeType.MERGE)
    @Cascade(org.hibernate.annotations.CascadeType.MERGE)
    private Set<Saler> salerSet;

}
