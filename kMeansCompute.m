function [means,clusters] = kMeansCompute(data,k,distFunc,numIter) % initialize the function
    [m,n] = size(data); % get number of rows and columns from data set
    means = zeros(k,n); % initialize the means data set with k means
    for i = 1:k
        randomRow = round(rand(1)*m); % get random row from dataset
        means(i,1:n) = data(randomRow,1:n); % initialize random point from dataset
    end
    
    for i = 1:numIter % iterates through the input number of iterations
        distances = zeros(m,k); % initialize array to hold distance of each point to each mean
        clusters = zeros(m,1); % initialize array that assigns each data point with a mean
        for j = 1:m % loops through the rows of data
            for l = 1:k % loops through the number of means
                distances(j,l) = distFunc(means(l,:),data(j,:)); % calculates the distance between the mean and the data point
            end
            clusters(j,1) = find((distances(j,:))==(min(distances(j,:))),1); % assigns each data point with a mean
        end
        for j = 1:k
            means(j,:) = mean(data(clusters==j,:)); % calculates the new means
        end
    end
    for j = 1:m
        clusters(j,1) = find(distances(j,:)==min(distances(j,:))); % assigns each data point with a final mean
    end
end