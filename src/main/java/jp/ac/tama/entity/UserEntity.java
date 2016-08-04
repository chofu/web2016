package jp.ac.tama.entity;

import jp.sf.amateras.mirage.annotation.Column;
import jp.sf.amateras.mirage.annotation.PrimaryKey;
import jp.sf.amateras.mirage.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by owner on 2016/08/03.
 */
@Data
@Table(name = "user")
@AllArgsConstructor
public class UserEntity {

    @Column(name = "user_id")
    @Id
    @PrimaryKey(generationType = PrimaryKey.GenerationType.APPLICATION)
    private String user_id;
    @Column(name="user_name")
    private String user_name;
}
