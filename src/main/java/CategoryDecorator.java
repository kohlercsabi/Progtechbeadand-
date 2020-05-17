public abstract class CategoryDecorator implements ICharacter {
    protected ICharacter character;

    public CategoryDecorator(ICharacter character) {
        this.character = character;
    }
}
