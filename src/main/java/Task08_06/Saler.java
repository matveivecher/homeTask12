package Task08_06;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Saler {
    @Id

    private Integer id;
    @Column
    private String name;
    @Column
    private String patronymic;
    @Column
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
