function [] = imageCompress(inputImage, numIter) % initializes the function

    image = imread(inputImage); % reads the image

    image = cast(image,'double'); % casts the image as a double datatype

    image = reshape(image,[128*128,3]); % reshapes image into the correct size of array

    [means,clusters] = kMeansCompute(image,32,@calculateDistance,numIter); % calls kMeansCompute to reduce the number of color options in the image
    
    for i = 1:(128*128) % loops through entire image
        image(i,:) = means(clusters(i),:); % assigns each pixel with a color
    end
    
    image = cast(image,'uint8'); % casts the image as a uint8 datatype

    image = reshape(image,[128,128,3]); % reshapes the image to the original dimensions
    
    imagesc(image) % displays the new image
end