package miu.edu.HouseManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Table(name = "houses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer houseNumber;

    @Min(1)
    private Integer numberOfRooms;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private HouseOwner owner;

    public House(Integer numberOfRooms, String address, HouseOwner owner) {
        this.numberOfRooms = numberOfRooms;
        this.address = address;
        this.owner = owner;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("houseNumber=").append(houseNumber);
        sb.append(", numberOfRooms=").append(numberOfRooms);
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
