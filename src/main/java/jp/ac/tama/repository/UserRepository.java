package jp.ac.tama.repository;

import jp.ac.tama.entity.UserEntity;
import org.springframework.data.mirage.repository.MirageRepository;

/**
 * Created by owner on 2016/08/03.
 */
public interface UserRepository extends MirageRepository<UserEntity, String> {

}
