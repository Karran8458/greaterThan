function greaterThan(arr,y)
{
	var count = 0;
	for(var i = 0; i < arr.length; i++)
	{
		if (arr[i] > y)
		{
			count++;
		}
	}
	console.log(count);
}
