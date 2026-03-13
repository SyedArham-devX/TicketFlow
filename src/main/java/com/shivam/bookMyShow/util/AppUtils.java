package com.shivam.bookMyShow.util;
import com.shivam.bookMyShow.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;
public class AppUtils {
    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
