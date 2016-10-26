package com.ocmms.cmms.conversion;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import com.ocmms.cmms.model.Users;
import com.ocmms.cmms.repository.UsersRepository;

public class UsersFormatter implements Formatter<Users> {

    @Autowired
    private UsersRepository usersService;


    public UsersFormatter() {
        super();
    }

    public Users parse(final String text, final Locale locale) throws ParseException {
       // final Long varietyId = Long.valueOf(text);
        return this.usersService.findOne(text);
    }


    public String print(final Users object, final Locale locale) {
        return (object != null ? object.getUserName() : "");
    }

}
