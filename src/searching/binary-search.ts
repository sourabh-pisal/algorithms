export const binarySearch = (key: number, arr: number[]): number => {
  let lo = 0;
  let hi = arr.length - 1;

  while (lo <= hi) {
    const mid = lo + Math.floor((hi - lo) / 2);

    if (key < arr[mid]) {
      hi = mid - 1;
    } else if (key > arr[mid]) {
      lo = mid + 1;
    } else {
      return mid;
    }
  }
  return -1;
};

console.log("Binary Search for 5 in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
const validSearch = binarySearch(5, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
console.log("Index of 5: ", validSearch);

console.log("Binary Search for 11 in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
const invalidSearch = binarySearch(11, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
console.log("Index of 11: ", invalidSearch);
