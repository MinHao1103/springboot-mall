/**
 * 因為 tsconfig.app.json 中，有 include 所有 src 底下任何資料夾的任何檔案，且結尾是 .d.ts 檔
 * 所以任何的 ts 檔皆可使用，可在此檔全域宣告
 */

// 全域宣告 bootstrap，因為 TypeScript 是強行別
declare var bootstrap: any;
