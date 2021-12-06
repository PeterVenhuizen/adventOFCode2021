class Fish {
    private int daysUntilNew;
    private boolean firstTimer;

    public Fish() {
        this.daysUntilNew = 8;
        this.firstTimer = true;
    }

    public Fish(int daysUntilNew) {
        this.daysUntilNew = daysUntilNew;
        this.firstTimer = false;
    }

    public int getDays() {
        return this.daysUntilNew;
    }

    public void mature() {
        this.daysUntilNew--;
    }

    public boolean isReadyToSpawn() {
        if (this.daysUntilNew < 0) {
            this.resetDaysUntilNew();
            return true;
        }
        return false;
    }

    private void resetDaysUntilNew() {
        if (this.firstTimer)
            this.firstTimer = false;
        this.daysUntilNew = (this.firstTimer) ? 8 : 6;
    }

    @Override
    public String toString() {
        return Integer.toString(this.daysUntilNew);
    }

}