/**
 * Entity class for Product
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productcategory_id", referencedColumnName = "id")
    // @JsonIgnore
    private ProductCategory productCategory;

}
