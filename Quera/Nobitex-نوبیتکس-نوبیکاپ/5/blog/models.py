from django.db import models
from django.contrib.auth import get_user_model
from django.utils import timezone

# migrations.RunSQL(
#     """
#     insert into blog_category (title, status) select distinct category, '1' from blog_article;
#     UPDATE blog_article SET category = (SELECT id FROM blog_category WHERE blog_category.title = blog_article.category);
#     UPDATE blog_article SET author = (SELECT id FROM account_user WHERE blog_article.author = account_user.username);
#     """
# ),

class Category(models.Model):
    title = models.CharField(max_length=50)
    status = models.BooleanField(default=True)


class Article(models.Model):
    class Status(models.TextChoices):
        DRAFT = 'd'
        PUBLISHED = 'p'

    author = models.ForeignKey(get_user_model(), max_length=50, on_delete=models.CASCADE, blank=True, null=True)
    title = models.CharField(max_length=100)
    category = models.ForeignKey(Category, blank=True, null=True, on_delete=models.SET_NULL)
    body = models.TextField()
    created = models.DateTimeField(auto_now_add=True)
    updated = models.DateTimeField(null=True)
    published = models.DateTimeField(default=timezone.now)
    status = models.CharField(
        max_length=2,
        choices=Status.choices,
        default=Status.DRAFT,
    )

    def save(self, *args, **kwargs):
        self.updated = timezone.now()
        return super(Article, self).save(*args, **kwargs)
