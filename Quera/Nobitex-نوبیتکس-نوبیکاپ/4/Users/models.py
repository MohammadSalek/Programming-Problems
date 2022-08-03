from django.db import models
from django_jalali.db import models as jmodels
from jdatetime import date as jdate


class CustomUser(models.Model):
    GENDER = [
        ('M', 'Male'),
        ('F', 'Female'),
    ]

    username = models.CharField(max_length=255)
    full_name = models.CharField(max_length=255)
    gender = models.CharField(max_length=1, choices=GENDER, )
    national_code = models.CharField(max_length=10)
    birthday_date = jmodels.jDateField()
    ceremony_datetime = jmodels.jDateTimeField(null=True)
    country = models.CharField(default="Iran", max_length=255)

    def get_first_and_last_name(self):
        if self.full_name:
            first_name, last_name = str(self.full_name).split(' ')
            return {
                'first_name': first_name.capitalize(),
                'last_name': last_name.capitalize(),
            }
        return {}

    def get_age(self):
        return jmodels.jDateField.parse_date(jmodels.datetime.datetime.now()).year - self.birthday_date.year

    def is_birthday(self):
        today = jdate.today()
        birthday = self.birthday_date
        return today.month == birthday.month and today.day == birthday.day
