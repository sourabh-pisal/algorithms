import { binarySearch } from "./binary-search";

describe("binary search", () => {
  it("should return the index of the target value in the array", () => {
    expect(binarySearch(3, [1, 2, 3, 4, 5])).toBe(2);
  });

  it("should return -1 if the target value is not in the array", () => {
    expect(binarySearch(6, [1, 2, 3, 4, 5])).toBe(-1);
  });
});
