clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
file2=input('\n Enter output Image File Name','s');
nx=input('Enter the number of times n');
x=imread(file1);
[r,c,d]=size(x);

c1=1;
for i=1:nx
    y(1:r,c1:i*c,1:d)=x(1:r,1:c,1:d);
    c1=c1+c;
end
imshow(y);
imwrite(y,file2);
