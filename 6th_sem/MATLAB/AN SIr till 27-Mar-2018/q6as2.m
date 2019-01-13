%q6as2.m : Write a program to input any image file. Take reflection along
%x-axis. Display final image.
clc;
close all;
clear all;
file1=input('\nEnter Input Image file name=','s');
file2=input('Enter Output Image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y=x; %copying image pixels into y
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d);
imshow(y);
imwrite(y,file2);
%End of program
