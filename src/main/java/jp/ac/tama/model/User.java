package jp.ac.tama.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by owner on 2016/08/03.
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String name;
}