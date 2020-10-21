package photoapp.api.users.photoapp.api.users.service;

import photoapp.api.users.photoapp.api.users.shared.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
