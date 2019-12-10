export class Product {
    constructor(
        public name: string,
        public category: string,
        public price: number,
        public imgUrl: string,
        public info: string,
        public pk?: string
    ) {}
}
