from django import forms
from .models import CustomUser


class CustomUserForm(forms.ModelForm):
    national_code = forms.CharField(
        min_length=10,
        max_length=10,
    )

    class Meta:
        model = CustomUser
        fields = '__all__'

    def clean(self):
        cleaned_data = super(CustomUserForm, self).clean()
        full = cleaned_data.get('full_name', None)
        if not full:
            raise forms.ValidationError('full_name does not exist')
        first, last = full.split(' ')
        if first.capitalize() != first or last.capitalize() != last:
            raise forms.ValidationError('wrong first_name or last_name format')
        return cleaned_data
