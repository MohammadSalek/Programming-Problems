from .models import CustomUser
from django.contrib import admin


# from django_jalali.admin.filters import JDateFieldListFilter
# import django_jalali.admin as jadmin

class CustomUserAdmin(admin.ModelAdmin):
    model = CustomUser
    list_display = ['first_name', 'last_name', 'username', 'gender', 'national_code', 'birthday_date', ]
    readonly_fields = ('first_name', 'last_name')
    # search_fields = ['first_name', 'last_name']
    ordering = ('ceremony_datetime',)

    def first_name(self, obj):
        res = obj.get_first_and_last_name()
        if res:
            return res['first_name']

    def last_name(self, obj):
        res = obj.get_first_and_last_name()
        if res:
            return res['last_name']


admin.site.register(CustomUser, CustomUserAdmin)
