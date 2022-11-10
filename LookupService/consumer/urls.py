from django.urls import path
from . import views

urlpatterns = [
    path('product/category/', views.ProductCategoryListView.as_view(), name="ProductCategoryListView"),
    path('product/list', views.ProductListView.as_view(), name='ProductListView')
]